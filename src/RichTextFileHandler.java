import oop.patterns.chainofresponsibility.File;

public class TextFileHandler implements Handler{
    private  Handler nextHandler;
    private String name;

    public  void TextFileHandler(String name,Handler nextHandler) {
        this.name = name;
    }

    @Override
    public void setHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if(file.getFileType().equals("txt"))
            System.out.println("Processing " + file.getFileName() + "." +file.getFileType() + "by " + name);
        else
            System.out.println("File not supported" + file.getFileType());
    }

    @Override
    public String getName() {
        return name;
    }
}
