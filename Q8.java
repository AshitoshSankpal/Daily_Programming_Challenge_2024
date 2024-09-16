class Q8{
    

        public static String reverseWords(String s) {
            
            String[] words = s.trim().split("\\s+");
            
           
            StringBuilder reversedString = new StringBuilder();
            
            
            for (int i = words.length - 1; i >= 0; i--) {
                reversedString.append(words[i]);
                if (i != 0) {
                   
                    reversedString.append(" ");
                }
            }
            
            return reversedString.toString();
        }
    
        public static void main(String[] args) {
            String input = "the sky is blue";
            String result = reverseWords(input);
            System.out.println(result); 
        }
    }
    
