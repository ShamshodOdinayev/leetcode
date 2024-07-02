package org.example;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
      /*  Given a string s, find the first non - repeating character in it and return its index.
                If it does not exist, return -1.

        Example 1:
        Input:
        s = "leetcode"
        Output:
        0
        Example 2:
        Input:
        s = "loveleetcode"
        Output:
        2
        Example 3:
        Input:
        s = "aabb"
        Output:
        -1*/
        System.out.println(firstUniqChar("\"sdnvlbkrmtbollujsdjfjfppksravjkwwsimlmdtcmiilpjibjhcppluisqbqfwrjjlrapsmcwrsrnfrmtjrffpuuqwonqfjfqxellpvmcfmhxccljqlvboioelpfcawrxlwsajfaiehutvogduhobwgpogvatpbvoaognbepqnkhkjsvqmfaghavopppcjbjunuaeotpkbfsmeqikjflakgjexnqqgxnsdjolbjbvhreighxhkihwphexwqufasjakmrdrpwciefaiqsaifmcfdeidhmjekoorvcuxtejlrfscrjekfkcnsdhhsxenhkuanafdpnsjnepdmvvrhbxwuhmrkenrcwbadsiulpvcklhlburudrbbskokwnwqktwjxstsvebvpqcugxjebcivudojorntphtscxhoxlhteuqunhvrsndtabfpdqdcsuqmdbeiiexdkaqtgkncfatlawrudbausifpsicibgrwastcxkjasmrmtrchbwlkxnbsxeaurtfdwmjqkgikcctgccsisgwlkkwflvahasltfusxogtbejrderxbqshacgsrvtqpgdcwmuwuejcmqanirwthsaxihlowgwjeegdltsujtrfuhjnqjjefqjwubiktuglirmgcdqfolvmrilkrvtlrtntujffbrtfiwdtvtfrkfnwklfulecxtkvqp\n"));

    }

    public static int firstUniqChar(String s) {
        int[] a = new int[s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == 1) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    count++;
                    a[j] = 1;
                }
            }
            if (count == 0) {
                return i;
            }
            count = 0;
        }
        return -1;
    }
}
