package rp.satria.guccishoes.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GetCustomer {
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private String result ;
    @SerializedName("message")
    private String message;
    public GetCustomer() {}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
