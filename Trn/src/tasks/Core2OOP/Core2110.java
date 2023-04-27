package tasks.Core2OOP;

public class Core2110 {
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public int hashCode() {
            long temp = Double.doubleToLongBits(re);
            int result = (int) (temp >>> 11);
            temp = Double.doubleToLongBits(im);
            return 17 * result + (int) (temp >>> 13);

//            return (int) ((re) * (im));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ComplexNumber that = (ComplexNumber) o;

//            if (Double.compare(that.re, re) != 0) {
//                return false;
//            }
            return Double.compare(that.im, im) == 0 && Double.compare(that.re, re) == 0;
        }
    }

    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(12.12433, 43);
        ComplexNumber cn2 = new ComplexNumber(12.124336, 43);
        System.out.println(cn1.equals(cn2));
        System.out.println(cn1.hashCode());
        System.out.println(cn2.hashCode());
    }
}
