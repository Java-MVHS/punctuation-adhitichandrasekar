/*
Adhiti Chandrasekar
P7
12/12/24
This program takes all the words with punctuation following it from the paragraphs written by Winston Churchill and prints them.
1. create instance of main method to call search it
2. in method search it, call getPunctuationWords and checkForPunctuation and pass the text in as argument
3. in getPunctuationWords separate text into words by looking at the spaces
4. In checkPunctuationWords, check which words are followed by a punctuation
5. In printWords print the text
 */

public class Punctuation
{
    public static void main(String[] args)
    {
        Punctuation p = new Punctuation(); // Make an instance of the main method since it is static
        p.searchIt(); // call search it method
    }

    public void searchIt()
    {
        String punctuationWords = ""; // D&I variable
        String text = "Blood, Sweat, and Tears by Winston Churchill " + // Put text inside string variable
                "May 13, 1940 " +
                "Mr. Speaker: " +
                "On Friday evening last I received His Majesty’s commission to form a new " +
                "Administration. It was the evident wish and will of Parliament and the " +
                "nation that this should be conceived on the broadest possible basis and that it should " +
                "include all parties, both those who supported the late Government and also the parties " +
                "of the Opposition. " +
                "I have completed the most important part of this task. A War Cabinet has " +
                "been formed of five Members, representing, with the Liberal Opposition, the unity of the " +
                "nation. The three party Leaders have agreed to serve, either in the War Cabinet or in " +
                "high executive office. The three Fighting Services have been filled. It was necessary " +
                "that this should be done in one single day, on account of the extreme urgency and " +
                "rigour of events. A number of other key positions were filled yesterday, and I am " +
                "submitting a further list to His Majesty tonight. I hope to complete the appointment of the " +
                "principal Ministers during tomorrow. The appointment of the other Ministers usually " +
                "takes a little longer, but I trust that, when Parliament meets again, this part of my task " +
                "will be completed, and that the Administration will be complete in all respects. " +
                "Sir, I considered it in the public interest to suggest that the House should " +
                "be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in " +
                "accordance with the powers conferred upon him by the Resolution of the House. At the " +
                "end of the proceedings today, the Adjournment of the House will be proposed until " +
                "Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The " +
                "business to be considered during that week will be notified to Members at the earliest " +
                "opportunity. I now invite the House, by the Resolution which stands in my name, to " +
                "record its approval of the steps taken and to declare its confidence in the new " +
                "Government. " +
                "Sir, to form an Administration of this scale and complexity is a serious " +
                "undertaking in itself, but it must be remembered that we are in the preliminary stage of " +
                "one of the greatest battles in history, that we are in action at many points in Norway and " +
                "in Holland, that we have to be prepared in the Mediterranean, that the air battle is " +
                "continuous and that many preparations have to be made here at home. In this crisis I " +
                "hope I may be pardoned if I do not address the House at any length today. I hope that " +
                "any of my friends and colleagues, or former colleagues, who are affected by the political " +
                "reconstruction, will make all allowances for any lack of ceremony with which it has been " +
                "necessary to act. I would say to the House, as I said to those who’ve joined this " +
                "government: \"I have nothing to offer but blood, toil, tears and sweat.\" " +
                "We have before us an ordeal of the most grievous kind. We have before " +
                "us many, many long months of struggle and of suffering. You ask, what is our policy? I " +
                "will say: It is to wage war, by sea, land and air, with all our might and with all the " +
                "strength that God can give us; to wage war against a monstrous tyranny, never " +
                "surpassed in the dark and lamentable catalogue of human crime. That is our policy. You " +
                "ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in " +
                "spite of all terror, victory, however long and hard the road may be; for without victory, " +
                "there is no survival. Let that be realised; no survival for the British Empire, no survival " +
                "for all that the British Empire has stood for, no survival for the urge and impulse of the " +
                "ages, that mankind will move forward towards its goal. " +
                "But I take up my task with buoyancy and hope. I feel sure that our cause " +
                "will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, " +
                "and I say, \"Come then, let us go forward together with our united strength.\"";

        punctuationWords = getPunctuationWords(text); // Pass text into getPunctuationWords and store the output in punctuationWords
        printWords(punctuationWords); // pass punctuationWords into printWords to print the final output
    }

    public String getPunctuationWords(String wordsln)
    {
        String word = "";
        String words = "";
        for (int i = 0; i < wordsln.length(); i++) { // Check each letter of the paragraph to see where there is a space and seperate into words
            char currentChar = wordsln.charAt(i);

            if (currentChar == ' ' || currentChar == '\n') { // If there is a space or new line
                if (checkForPunctuation(word)) {
                    words += word + " "; // adds the word value to words
                }
                word = ""; // Reset the word to form new words
            } else {
                word += currentChar; // Build the word character by character
            }
        }

        // Check the last word in case the text doesn't end with a space
        if (checkForPunctuation(word)) {
            words += word + " ";
        }

        return words;
    }

    public boolean checkForPunctuation(String wordIn2)
    {
        return (wordIn2.indexOf(';') != -1 || wordIn2.indexOf(',') != -1 || // Check if words is followed by any punctuation
                wordIn2.indexOf(':') != -1 || wordIn2.indexOf('\'') != -1 || //use single '' because it char
                wordIn2.indexOf('?') != -1 || wordIn2.indexOf('.') != -1 ||
                wordIn2.indexOf('!') != -1 || wordIn2.indexOf('"') != -1);
    }

    public void printWords(String wordsIn)
    { //print the method
        System.out.println("\n\n\n");
        System.out.println(wordsIn);
        System.out.println("\n\n\n");
    }
}
