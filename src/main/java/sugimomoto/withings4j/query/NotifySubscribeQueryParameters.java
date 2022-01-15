package sugimomoto.withings4j.query;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.FormBody;
import sugimomoto.withings4j.model.WithingsActionType;

public class NotifySubscribeQueryParameters extends QueryParameters {

    public NotifySubscribeQueryParameters() {
        this.builder.add("action", WithingsActionType.NOTIFY_SUBSCRIBE_SUBSCRIBE.getValue());
    }
    
}
