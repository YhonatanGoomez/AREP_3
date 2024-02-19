package arep2.taller2.Spark;

public class Answer {
    private String tipo;
    private String path;
    private String cuerpo;

    public String getHeader() {
        return "HTTP/1.1 200 OK\r\n" +
                "Content-type: "+tipo+"\r\n" +
                "\r\n";
    }

    public String getResponse() {
        return getHeader() + cuerpo;
    }

    public void setBody(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getType() {
        return tipo;
    }

    public String getPath() {
        return path;
    }

    public void setType(String tipo) {
        this.tipo = tipo;
    }

    public void setPath(String path) {
        this.path = path;
    }
}