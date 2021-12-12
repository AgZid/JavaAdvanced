package inheritance.example5;

import java.util.ArrayList;
import java.util.List;

public class WorkerMain {
    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();

        workers.add(new Daktaras("Tomas", 3000));
        workers.add(new Vairuotojas("Marius", 2000));
        workers.add(new Programuotojas("Robertas", 2200));
        workers.add(new Daktaras("Rolandas", 3200));

        for (Worker worker : workers) {
            System.out.println();
            System.out.println(worker.getName());
            System.out.println("Atlyginimas" + worker.getAlga());
            worker.work();
            if (worker instanceof Daktaras) {
                worker.setAtsotoguDienuSkaicius(22);
                worker.atostogauti();
            } else {
                worker.atostogauti();
            }
        }

    }
}
