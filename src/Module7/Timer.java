package Module7;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timer {
    public static void main(String[] args) {
        List<Integer> arrInt1000 = new ArrayList<>();
        List<String> arrStr1000 = new ArrayList<>();
        List<Integer> linkInt1000 = new LinkedList<>();
        List<String> linkStr1000 = new LinkedList<>();

        List<Integer> arrInt10000 = new ArrayList<>();
        List<String> arrStr10000 = new ArrayList<>();
        List<Integer> linkInt10000 = new LinkedList<>();
        List<String> linkStr10000 = new LinkedList<>();

        for (int index = 0; index < 1000; index++) {
            arrInt1000.add(1 + index);
            linkInt1000.add(1 + index);
            arrStr1000.add("String " + index);
            linkStr1000.add("String " + index);
        }
        for (int index = 0; index < 10000; index++) {
            arrInt10000.add(1 + index);
            linkInt10000.add(1 + index);
            arrStr10000.add("String " + index);
            linkStr10000.add("String " + index);
        }

        // add
        {
            long startAI = System.currentTimeMillis();
            arrInt1000.add(10);
            long finishAI = System.currentTimeMillis();
            long startLI = System.currentTimeMillis();
            linkInt1000.add(10);
            long finishLI = System.currentTimeMillis();
            long startAS = System.currentTimeMillis();
            arrStr1000.add("next");
            long finishAS = System.currentTimeMillis();
            long startLS = System.currentTimeMillis();
            linkStr1000.add("next");
            long finishLS = System.currentTimeMillis();
            System.out.println("Add in 1000: ArrListInt= " + (finishAI - startAI)
                    + ", LinListInt= " + (finishLI - startLI)
                    + ", ArrListStr= " + (finishAS - startAS)
                    + ", LinListStr= " + (finishLS - startLS));
        }
        {
            long startAI = System.currentTimeMillis();
            arrInt10000.add(10);
            long finishAI = System.currentTimeMillis();

                long startLI = System.currentTimeMillis();
                linkInt10000.add(10);
                long finishLI = System.currentTimeMillis();

                long startAS = System.currentTimeMillis();
                arrStr10000.add("next");
                long finishAS = System.currentTimeMillis();

                long startLS = System.currentTimeMillis();
                linkStr10000.add("next");
                long finishLS = System.currentTimeMillis();


                System.out.println("Add in 10000: ArrListInt= " + (finishAI - startAI)
                        + ", LinListInt= " + (finishLI - startLI)
                        + ", ArrListStr= " + (finishAS - startAS)
                        + ", LinListStr= " + (finishLS - startLS));
            }

            // set
            {
                long startAI = System.currentTimeMillis();
                arrInt1000.set(500,10);
                long finishAI = System.currentTimeMillis();

                long startLI = System.currentTimeMillis();
                linkInt1000.set(500,10);
                long finishLI = System.currentTimeMillis();

                long startAS = System.currentTimeMillis();
                arrStr1000.set(500,"next");
                long finishAS = System.currentTimeMillis();

                long startLS = System.currentTimeMillis();
                linkStr1000.set(500,"next");
                long finishLS = System.currentTimeMillis();

                System.out.println("Set in 1000: ArrListInt= " + (finishAI - startAI)
                        + ", LinListInt= " + (finishLI - startLI)
                        + ", ArrListStr= " + (finishAS - startAS)
                        + ", LinListStr= " + (finishLS - startLS));
            }
            {
                long startAI = System.currentTimeMillis();
                arrInt10000.set(500,10);
                long finishAI = System.currentTimeMillis();

                long startLI = System.currentTimeMillis();
                linkInt10000.set(500,10);
                long finishLI = System.currentTimeMillis();

                long startAS = System.currentTimeMillis();
                arrStr10000.set(500,"next");
                long finishAS = System.currentTimeMillis();

                long startLS = System.currentTimeMillis();
                linkStr10000.set(500,"next");
                long finishLS = System.currentTimeMillis();


                System.out.println("Set in 10000: ArrListInt= " + (finishAI - startAI)
                        + ", LinListInt= " + (finishLI - startLI)
                        + ", ArrListStr= " + (finishAS - startAS)
                        + ", LinListStr= " + (finishLS - startLS));
            }
            // get
            {
                long startAI = System.currentTimeMillis();
                arrInt1000.get(500);
                long finishAI = System.currentTimeMillis();

                long startLI = System.currentTimeMillis();
                linkInt1000.get(500);
                long finishLI = System.currentTimeMillis();

                long startAS = System.currentTimeMillis();
                arrStr1000.get(500);
                long finishAS = System.currentTimeMillis();

                long startLS = System.currentTimeMillis();
                linkStr1000.get(500);
                long finishLS = System.currentTimeMillis();

                System.out.println("Get in 1000: ArrListInt= " + (finishAI - startAI)
                        + ", LinListInt= " + (finishLI - startLI)
                        + ", ArrListStr= " + (finishAS - startAS)
                        + ", LinListStr= " + (finishLS - startLS));
            }
            {
                long startAI = System.currentTimeMillis();
                arrInt10000.get(500);
                long finishAI = System.currentTimeMillis();

                long startLI = System.currentTimeMillis();
                linkInt10000.get(500);
                long finishLI = System.currentTimeMillis();

                long startAS = System.currentTimeMillis();
                arrStr10000.get(500);
                long finishAS = System.currentTimeMillis();

                long startLS = System.currentTimeMillis();
                linkStr10000.get(500);
                long finishLS = System.currentTimeMillis();


                System.out.println("Get in 10000: ArrListInt= " + (finishAI - startAI)
                        + ", LinListInt= " + (finishLI - startLI)
                        + ", ArrListStr= " + (finishAS - startAS)
                        + ", LinListStr= " + (finishLS - startLS));
            }
            // remove
            {
                long startAI = System.currentTimeMillis();
                arrInt1000.remove(500);
                long finishAI = System.currentTimeMillis();

                long startLI = System.currentTimeMillis();
                linkInt1000.remove(500);
                long finishLI = System.currentTimeMillis();

                long startAS = System.currentTimeMillis();
                arrStr1000.remove(500);
                long finishAS = System.currentTimeMillis();

                long startLS = System.currentTimeMillis();
                linkStr1000.remove(500);
                long finishLS = System.currentTimeMillis();

                System.out.println("Remove in 1000: ArrListInt= " + (finishAI - startAI)
                        + ", LinListInt= " + (finishLI - startLI)
                        + ", ArrListStr= " + (finishAS - startAS)
                        + ", LinListStr= " + (finishLS - startLS));
            }
            {
                long startAI = System.currentTimeMillis();
                arrInt10000.remove(500);
                long finishAI = System.currentTimeMillis();

                long startLI = System.currentTimeMillis();
                linkInt10000.remove(500);
                long finishLI = System.currentTimeMillis();

                long startAS = System.currentTimeMillis();
                arrStr10000.remove(500);
                long finishAS = System.currentTimeMillis();

                long startLS = System.currentTimeMillis();
                linkStr10000.remove(500);
                long finishLS = System.currentTimeMillis();


                System.out.println("Remove in 10000: ArrListInt= " + (finishAI - startAI)
                        + ", LinListInt= " + (finishLI - startLI)
                        + ", ArrListStr= " + (finishAS - startAS)
                        + ", LinListStr= " + (finishLS - startLS));
            }
    }
}

