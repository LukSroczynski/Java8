package references;

import closures.Process;

/**
 * Created by Lukasz S. on 07.05.2017.
 * Differences between inner class 'this' AND lambda 'this'
 */
public class ThisDifferenceInnerClassLambdas {
    public static void main(String[] args) {
        ThisDifferenceInnerClassLambdas thisDifferenceInnerClassLambdas = new ThisDifferenceInnerClassLambdas();
        thisDifferenceInnerClassLambdas.doProcess(1000, new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i=" + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return " : INNER CLASS : ";
            }
        });

        /**
         * Lambdas treat this differently than anonymous class
         * In above example 'this' refers to instance of antonymous inner class
         * thisReferenceExample.doProcess(101, i -> System.out.println(this)); // that not's gonna work
         * BUT you can do that which is executed outside static context
         *         thisReferenceExample.execute();
         */

        thisDifferenceInnerClassLambdas.execute();
    }

    public void execute() {
        doProcess(10, i -> {
            System.out.println("Value of i=" + i);
            System.out.println(this);
        });
    }

    void doProcess(int i, Process process) {
        process.process(i);
    }

    @Override
    public String toString() {
        return " : MAIN : ";
    }
}
