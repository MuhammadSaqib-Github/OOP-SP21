package ASSIGNMENT;

public class Book extends Publication
{
    int pageCount;

    Book( String title , double v , int pageCount)
    {
        super(title,v);
        this.pageCount=pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String display() {
        return "Book{" +
                "pageCount=" + pageCount + super.display() +
                '}' ;
    }
}
