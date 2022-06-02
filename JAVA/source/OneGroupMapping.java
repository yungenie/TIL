package lai.module.starter.endpoint;

import com.diquest.lai.module.Endpoint;
import com.diquest.lai.module.EndpointMapping;
import com.google.gson.Gson;
import lai.module.starter.endpoint.example.model.OneGroupOutput;

@Endpoint
public class OneGroupMapping {

    private final Gson gson = new Gson();

    @EndpointMapping(mapping = "", description = "")
    public OneGroupOutput setVOMapping() {

        String output = "{\"resGroup\" : {\"custnm\" : \"\", \"custage\" : \"\"}}";
        OneGroupOutput resVO = gson.fromJson(output, OneGroupOutput.class);

        return resVO;

    }
}
