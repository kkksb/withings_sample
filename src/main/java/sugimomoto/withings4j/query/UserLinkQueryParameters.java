package sugimomoto.withings4j.query;

import sugimomoto.withings4j.model.WithingsActionType;

public class UserLinkQueryParameters extends QueryParameters {

    public UserLinkQueryParameters() {
        this.builder.add("action", WithingsActionType.USER_V2_LINK_LINK.getValue());
    }
    
    public void setMacAddresses(String macAddresses) {
        this.builder.add("mac_addresses", macAddresses);
    }

}
