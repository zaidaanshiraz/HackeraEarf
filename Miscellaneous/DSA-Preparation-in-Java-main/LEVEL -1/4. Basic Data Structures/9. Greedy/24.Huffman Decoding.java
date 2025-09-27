//https://practice.geeksforgeeks.org/problems/huffman-decoding/1

class Decode
{
    //Function to return the decoded string.
    static String decodeHuffmanData(MinHeapNode root, String encodedString)
    {
        
        // add your code here
        int idx=0;
        String decodedString="";
        while(idx<encodedString.length())
        {
            MinHeapNode curr=root;
            while(curr.data=='$')
            {
                if(encodedString.charAt(idx)=='0')
                curr=curr.left;
                else
                curr=curr.right;
                idx++;
            }
            decodedString=decodedString+curr.data;
        }
        return decodedString;
    }
}