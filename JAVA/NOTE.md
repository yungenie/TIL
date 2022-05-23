
### [GSON][gson.fromJson] Expected BEGIN_OBJECT but was STRING 오류
> 현상 : json to vo (json을 VO객체로) Expected BEGIN_OBJECT but was STRING 에러남.   
> 해결 : json 문자열데이터 형식 묶인 중괄호 "{}" 넣음.   
> 예시 :  "A" : {"name" : "yunjin", "feel" : "happy"} -> {"A" : {"name" : "yunjin", "feel" : "happy"}}    
> 설명 : 모든 JSON 객체는 묶인 중괄호 "{}"를 사용하여 표현해야 함. 즉, 항상 열린 중괄호 "{"로 시작해야 함. 그렇지 않으면 gson이 예상 BEGIN_OBJECT를 throw함. 따라서 json 문자열이 JSON 표준 표현 형식을 따르는지 확인해야함.
> 참고 : https://www.sneppets.com/java/error-expected-begin_object-but-was-string-at-line-1-column-1/
