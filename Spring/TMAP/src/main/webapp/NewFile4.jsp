<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>simpleMap</title>
        <script src="https://apis.openapi.sk.com/tmap/jsv2?version=1&appKey=l7xxe8583592f510477c8480044d12760288"></script>
<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
		
<script>
        var map,marker;
    	var lonlat;
    	var markers = [];
// 페이지가 로딩이 된 후 호출하는 함수입니다.

function initTmap(){
	// map 생성
	// Tmapv2.Map을 이용하여, 지도가 들어갈 div, 넓이, 높이를 설정합니다.
	map = new Tmapv2.Map("map_div", { // 지도가 생성될 div
		center: new Tmapv2.LatLng(37.566481622437934, 126.98502302169841), // 지도 초기 좌표
		width : "100%", // 지도의 넓이
		height : "400px"  // 지도의 높이
		
	});
	
};
//마커의 옵션을 설정해주는 함수입니다.
function addMarker(lonlatoption){
	// 마커 생성
	var marker = new Tmapv2.Marker({
		position: new Tmapv2.LatLng(lonlatoption.lonlat.latitude(),lonlatoption.lonlat.longitude()), //Marker의 중심좌표 설정.
		map: map, //Marker가 표시될 Map 설정..
		title : lonlatoption.title //마우스 위치시 출력할 타이틀
	});
	markers.push(marker);
}

function removeMarkers(){
	
	for (var i = 0; i < markers.length; i++) {
		markers[i].setMap(null);
	}
	markers = [];
}

function searchPOI() {
	removeMarkers();
	var point = $('#point').val();
    var center = map.getCenter();//map의 중심 좌표 값을 받아 옵니다.
    var optionObj = {
        reqCoordType:"WGS84GEO", //요청 좌표계 옵셥 설정입니다.
        resCoordType:"WGS84GEO",  //응답 좌표계 옵셥 설정입니다.
        centerLon:126.925356, //POI검색시 중앙좌표의 경도입니다.
        centerLat:37.554034	//POI검색시 중앙좌표의 위도입니다. 
    };
    var params = {
        onComplete:onComplete,
        onProgress:onProgress,
        onError:onError
    };
    var tData = new Tmapv2.extension.TData();
    tData.getPOIDataFromSearchJson(encodeURIComponent(point),optionObj,params);//encodeURIComponent함수로 해당 파라메터 값을 처리합니다.
}

//POI검색
function onComplete() {
    
    console.log(this._responseData); //json로 데이터를 받은 정보들을 콘솔창에서 확인할 수 있습니다.
    
    if(this._responseData.searchPoiInfo.pois.poi != ''){
        jQuery(this._responseData.searchPoiInfo.pois.poi).each(function(){//결과를 each문으로 돌려 마커를 등록합니다.
            //response 데이터중 원하는 값을 find 함수로 찾습니다.
           	var name = this.name;
            var id = this.id;
            var lon = this.frontLon;
            var lat = this.frontLat;
            var lonlatoption = {
            	title : name,//마커 라벨 text 설정
                lonlat:new Tmapv2.LatLng(lat,lon)//마커 라벨 좌표 설정
            };
            addMarker(lonlatoption);//마커를 추가하는 함수입니다.
        });
    }else {
        alert('검색결과가 없습니다.');
    }
    map.setCenter(new Tmapv2.LatLng(37.554034, 126.925356));
    map.setZoom(12);
}

//데이터 로드중 실행하는 함수입니다.
function onProgress(){
      
}

//데이터 로드 중 에러가 발생시 실행하는 함수입니다.
function onError(){
	alert("onError");
}
</script>
    </head>
    <body onload="initTmap()">
        <div id="map_div">
        </div>   
        
        <input type="text" class = "text" id ="point" value = "">
        <input type ="button" class="btn btn-primary" id ="sp" onclick="searchPOI();" value="검색">
     
        <button onClick="searchPOI()">POI검색 실행</button>
    </body>
</html>	
