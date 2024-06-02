package ltts.com.EmployeeApplication.exception;

public class ExceptionResponse {

    private String errorMessage;
    private String requestedURI;
    private String timeStamp;

    public ExceptionResponse() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRequestedURI() {
        return requestedURI;
    }

    public void setRequestedURI(String requestedURI) {
        this.requestedURI = requestedURI;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "ExceptionResponse{" +
                "errorMessage='" + errorMessage + '\'' +
                ", requestedURI='" + requestedURI + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
