package tasks.Core2OOP;

import java.util.Arrays;

public class Core256 {
    public static class AsciiCharSequence implements CharSequence {
        private byte[] byteArr;

        public AsciiCharSequence(byte[] content) {
            this.byteArr = content;
        }

        @Override
        public int length() {
            return byteArr.length;
        }

        @Override
        public char charAt(int index) {
            return (char) byteArr[index];
        }

        @Override
        public CharSequence subSequence(int beginIndex, int endIndex) {
            return new AsciiCharSequence(Arrays.copyOfRange(byteArr, beginIndex, endIndex));
        }

        @Override
        public String toString() {
            return new String(byteArr);
        }
    }

    public static void main(String[] args) {
        byte[] arr1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q'};
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(arr1);
        System.out.println(asciiCharSequence);
    }
}
