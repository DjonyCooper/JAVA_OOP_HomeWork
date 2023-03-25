package Java.OOP_6.dip1;

import Java.OOP_6.dip1.model.Report;
import Java.OOP_6.dip1.model.ReportItem;
import Java.OOP_6.dip1.model.util.Printer;
import Java.OOP_6.dip1.model.util.ReportPrinter;
import Java.OOP_6.logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {

        log.log(Level.INFO, "Стартовал метод main в пакете model");
        Printer<ReportItem> printer = new ReportPrinter();
        Report report = new Report(printer);
        report.calculate();
        report.output();
    }
}