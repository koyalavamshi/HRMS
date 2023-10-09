package resources;

public enum APIResource {
    getUserAPI("/users/2"),
    AddUserAPI("users"),
    DeleteUserAPI("users/2");
private String resources;
    APIResource(String resources) {
        this.resources=resources;

    }
    public String getResource(){
        return resources;
    }
}
