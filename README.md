# CovidInfoApp - Android App
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
* ...
* ...
## Authorization
<h4> COVID-19 Vaccination Status API </h4> 

```html
GET /api/15077756/v1/vaccine-stat?page=1&perPage=10&serviceKey=[YOUR_SERVICE_KEY]&cond[baseDate::EQ]=[YOUR_BASE_DATE]
```    

<!-- Table -->
|Parameter|Type|Description|
|--|--|--|
|page|integer||
|perPage|integer||
|<b>serviceKey</b>|string|Your service key|
|cond[baseDate::EQ]|string|Statistics base date. cf. "21:10:22 00:00:00"|

Reference = https://www.data.go.kr/data/15077756/openapi.do

## CopyRights
<div>아이콘 제작자 <a href="https://www.freepik.com" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/kr/" title="Flaticon">www.flaticon.com</a></div>

https://www.data.go.kr/data/15077756/openapi.do
