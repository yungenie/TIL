
#### 2022-05-23 Mon
### [GSON][gson.fromJson] Expected BEGIN_OBJECT but was STRING 오류
> 현상 : json to vo (json을 VO객체로) Expected BEGIN_OBJECT but was STRING 에러남.   
> 해결 : json 문자열 데이터 형식 묶인 중괄호 "{}" 넣음.   
> 예시 :  "A" : {"name" : "yunjin", "feel" : "happy"} -> {"A" : {"name" : "yunjin", "feel" : "happy"}}    
> 설명 : 모든 JSON 객체는 묶인 중괄호 "{}"를 사용하여 표현해야 함. 즉, 항상 열린 중괄호 "{"로 시작해야 함. 그렇지 않으면 gson이 예상 BEGIN_OBJECT를 throw함. 따라서 json 문자열이 JSON 표준 표현 형식을 따르는지 확인해야함.  
> 출처 : https://www.sneppets.com/java/error-expected-begin_object-but-was-string-at-line-1-column-1/

### [VO] API로 받은 json데이터를 그대로 VO형태로 바꿔서 사용할 수 있는 방법    
> 현상 : 데이터 형태가 "data" : {"a" : {"name" : "yunjin", "feel" : "happy"} "data" value값을 그대로 VO 넘길때    
> 해결 : vo 클래스에 @SerializedName("a") private A<JsonObject> a; 선언. 이너클래스 A<J extends JsonElement> {String name, String feel}   

출처: https://create-drop.tistory.com/18 [개발은 끝이없고]    
