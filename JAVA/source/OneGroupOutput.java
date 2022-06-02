package lai.module.starter.endpoint.example.model;

import com.diquest.lai.module.Param;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OneGroupOutput {

    /** RestAPI로 받은 json데이터 그대로 VO형태로 변환
     *
     * Output format : 변수항목 1개 존재  (그룹 Key안에 서브 Keys 존재)
     * Output example : "resGroup" : {"custnm" : "", "custage" : ""}
     *
     * */

    @SerializedName("resGroup")
    @Param(description = "그룹", required = true, sample = "홍길동")
    private ResGroup<JsonObject> resGroup;

    @Data
    class ResGroup<J extends JsonElement> {

        @Param(description = "고객이름", required = true, sample = "홍길동")
        private String custnm;

        @Param(description = "고객나이", required = true, sample = "20")
        private String custage;

        @Param(description = "고객발신자번호", required = true, sample = "01012341234")
        private String custPhone;
    }

}


