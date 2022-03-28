package lesson38_2;

public class ScannerException extends Exception { //Мы уснаследовались от класса Exception, поэтому новый
                                                 // класс представляет из себя исключение
    public ScannerException(String description) {
        super(description);
    }

    public ScannerException() {

    }
}
