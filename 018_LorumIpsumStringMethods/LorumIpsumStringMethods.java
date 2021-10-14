public class LorumIpsumStringMethods {
    public static void main(String[] args){

        //variable that holds ipsum sample
        String ogIpsum = "Say cheese feta parmesan. Feta cheese slices gouda goat macaroni cheese cottage cheese croque monsieur macaroni cheese. Fromage pepper jack the big cheese cream cheese mozzarella cheesecake babybel rubber cheese. Cream cheese feta cottage cheese bocconcini melted cheese camembert de normandie.Pepper jack the big cheese cheeseburger. Cow ricotta cheese strings blue castello who moved my cheese squirty cheese macaroni cheese fromage. Port-salut halloumi paneer brie chalk and cheese emmental caerphilly everyone loves. Roquefort pepper jack airedale. Say cheese chalk and cheese emmental. Gouda mascarpone camembert de normandie manchego the big cheese melted cheese manchego stinking bishop.    Gouda red leicester chalk and cheese ricotta paneer croque monsieur cheeseburger queso. Blue castello cheesy feet manchego emmental stinking bishop babybel smelly cheese st. agur blue cheese. Bocconcini macaroni cheese cauliflower cheese. Roquefort stinking bishop stilton. Smelly cheese monterey jack the big cheese emmental st. agur blue cheese cheese on toast cheddar camembert de normandie. Rubber cheese cut the cheese hard cheese red leicester cheese triangles mascarpone babybel airedale. Bocconcini lancashire airedale cheese and biscuits cream cheese roquefort cauliflower cheese boursin. Port-salut. Rubber cheese cut the cheese fondue. Cheese slices cheese slices mascarpone fromage frais danish fontina edam fromage boursin. Brie babybel cow roquefort brie cheddar bavarian bergkase cream cheese. Cheese on toast jarlsberg cauliflower cheese port-salut hard cheese jarlsberg cheeseburger.    ";
        
        //blob length 
        int blobLength = ogIpsum.length();
        //blob trim
        String trimmedIpsum  = ogIpsum.trim();
        //trimmed blob length 
        int trimmedBlobLength = trimmedIpsum.length();
        //make uppercase and lowercase
        String uppercaseIpsum = trimmedIpsum.toUpperCase();
        String lowerCaseIpsum = trimmedIpsum.toLowerCase();
        //comparing ipsums
        boolean comparedIpsums = trimmedIpsum.equals(ogIpsum);
        boolean comparedfornoreasonIpsums = trimmedIpsum.equals(trimmedIpsum);
        //first instance of q
        int qFirstAppearance = trimmedIpsum.indexOf("q");
        // replace o with x
        String replacedIpsum = trimmedIpsum.replace("o", "x");
        //check if contains z
        boolean doesIpsumContainZ = trimmedIpsum.contains("z");

        //print statements
        //length
        System.out.println("The original blob is " + blobLength + " characters long");
        System.out.println("The trimmed blob is " + trimmedBlobLength + " characters long");
        //print off in upper and lower case
        System.out.println("");
        System.out.println("In upper case, the blob is, " + uppercaseIpsum);
        System.out.println("");
        System.out.println("In lower case, the blob is, " + lowerCaseIpsum);
        System.out.println("");
        //compare blobs
        System.out.println("It is " + comparedIpsums + " that the original ipsum and the trimmed ipsum are the same");
        System.out.println("It is " + comparedfornoreasonIpsums + " that the original ipsum and the trimmed ipsum are the same");
        System.out.println();

        // indexing
        System.out.println("Q first appears at character " + qFirstAppearance);
        System.out.println("");
        System.out.println("When when replacing o woth x, the ipsum look like this : " + replacedIpsum);
        System.out.println("");
        System.out.println("When asking if the ipsum contains the letter z, the answer is " + doesIpsumContainZ);
    }
    
}

/*
1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments
*/