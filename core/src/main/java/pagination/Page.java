package pagination;

/**
 * Created by koval on 5/2/2017.
 */
public class Page {

    private long currentPage;
    private long numberOfElements;
    private long showElements;

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(long numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public long getShowElements() {
        return showElements;
    }

    public void setShowElements(long showElements) {
        this.showElements = showElements;
    }
}
