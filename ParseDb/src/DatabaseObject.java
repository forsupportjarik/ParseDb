
public class DatabaseObject {

    private Long idObject;
    private String classObject;
    private String distName;
    private String content;

    public DatabaseObject(Long idObject, String classObject, String distName, String content) {
        this.idObject = idObject;
        this.classObject = classObject;
        this.distName = distName;
        this.content = content;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DatabaseObject that = (DatabaseObject) o;

        if (idObject != null ? !idObject.equals(that.idObject) : that.idObject != null) return false;
        if (classObject != null ? !classObject.equals(that.classObject) : that.classObject != null) return false;
        if (distName != null ? !distName.equals(that.distName) : that.distName != null) return false;
        return content != null ? content.equals(that.content) : that.content == null;
    }

    @Override
    public int hashCode() {
        int result = idObject != null ? idObject.hashCode() : 0;
        result = 31 * result + (classObject != null ? classObject.hashCode() : 0);
        result = 31 * result + (distName != null ? distName.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DatabaseObject{" +
                "idObject=" + idObject +
                ", classObject='" + classObject + '\'' +
                ", distName='" + distName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
