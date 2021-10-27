# CovidInfoApp - Android App  
<img width="400" alt="Sellers" src="https://user-images.githubusercontent.com/18653295/139101425-0934c5a1-225a-4203-88f1-93e84d28a7fd.jpg">  
Get Information about Covid-19 vaccination(South Korea)   

  
## About
<img width="370" alt="스크린샷 2021-10-20 오전 11 14 33" src="https://user-images.githubusercontent.com/18653295/138016768-a48f76a6-6426-4e30-9a60-2876e749cd26.png">  


CovidInfoApp has been made for you to comfortably get Covid-19 vaccination information of South Korea . 
....
## Features
The android app lets you:
* Get coronavirus (COVID-19) vaccination status
* Get articles read about Covid-19 vaccination in South Korea
* Get Vaccination Center Information
* Completely ad-free
## ScreenShots
작성중..
## Permissions
On Android versions prior to Android 6.0, CovidInfoApp requires the following permissions:
* Full Network Access.

## Authorization
<h4> COVID-19 Vaccination Status API(코로나 백신 예방 접종 통계) </h4> 

[COVID-19 Vaccination Status API REFERENCE](https://www.data.go.kr/data/15077756/openapi.do)

```html
GET /api/15077756/v1/vaccine-stat?page=1&perPage=10&serviceKey=[YOUR_SERVICE_KEY]&cond[baseDate::EQ]=[YOUR_BASE_DATE]
```    

<!-- Table -->
|Parameter|Type|Description|
|--|--|--|
|`page`|integer||
|`perPage`|integer||
|`serviceKey`|string|Your service key|
|`cond[baseDate::EQ]`|string|Statistics base date. cf. "21:10:22 00:00:00"|

<h4> Naver News API(네이버 뉴스 검색 API) </h4> 

[NAVER API REFERENCE](https://developers.naver.com/docs/serviceapi/search/news/news.md#%EB%89%B4%EC%8A%A4)

```html
GET /v1/search/news.json?query=%EC%A3%BC%EC%8B%9D&display=10&start=1&sort=sim
```    

<!-- Table -->
|Parameter|Type|Description|
|--|--|--|
|`query`|string|<b>Required</b>|
|`display`|integer|10(default), 100(max value)|
|`start`|integer|1(default), 1000(max value)|
|`sort`|string|sim, date(default)|





## CopyRights
<div>아이콘 제작자 <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/kr/" title="Flaticon">www.flaticon.com</a></div>


