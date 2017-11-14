import java.util.Arrays;

public class DatabaseObject {

    private Long idObject;
    private String classObject;
    private String distName;
    private String content;
    private String parameterName;

    public DatabaseObject(Long idObject, String classObject, String distName, String content, String parameterName) {
        this.idObject = idObject;
        this.classObject = classObject;
        this.distName = distName;
        this.content = content;
        this.parameterName = parameterName;
    }

    public DatabaseObject(String classObject, String parameterName) {
        this.classObject = classObject;
        this.parameterName = parameterName;
    }

    public Long getIdObject() {
        return idObject;
    }

    public void setIdObject(Long idObject) {
        this.idObject = idObject;
    }

    public String getClassObject() {
        return classObject;
    }

    public void setClassObject(String classObject) {
        this.classObject = classObject;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatabaseObject that = (DatabaseObject) o;

        if (classObject != null ? !classObject.equals(that.classObject) : that.classObject != null) return false;
        return parameterName != null ? parameterName.equals(that.parameterName) : that.parameterName == null;
    }

    @Override
    public int hashCode() {
        int result = classObject != null ? classObject.hashCode() : 0;
        result = 31 * result + (parameterName != null ? parameterName.hashCode() : 0);
        return result;
    }


}
