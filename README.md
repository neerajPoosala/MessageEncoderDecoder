# Message Encoder Decoder

+ This is an updated version of the Java program for encoding and decoding strings using Base64 that includes a user interface to prompt the user to choose whether to encode or decode a message and to input the message they want to encode or decode.
   + Here's a step-by-step breakdown of how this program works:

  1. First, we import the `java.util.Base64 package`, which contains the Base64 class that we'll be using for encoding and decoding. We also import the `java.util.Scanner` package to read input from the user. 
  2. Next, we create a `Scanner` object to read input from the user, and we prompt the user to choose whether to encode or decode a message by entering either `1` or `2`.
  3. We then switch on the value entered by the user. If the user enters `1`, we prompt them to enter the message they want to encode and store it in the `message1` variable. We then encode the message using the Base64 class's `getEncoder()` method to obtain an instance of the `Base64.Encoder class`, which we can use to encode the message. We then call the `encodeToString()` method on this instance, passing in the bytes of the original message using the `getBytes()` method. This returns a string that represents the original message encoded using the Base64 algorithm, which we print to the console.
  4. If the user enters `2`, we prompt them to enter the message they want to decode and store it in the `message2` variable. We then decode the message using the Base64 class's `getDecoder()` method to obtain an instance of the `Base64.Decoder` class, which we can use to decode the message. We then call the `decode()` method on this instance, passing in the encoded message as a byte array. This returns a byte array that represents the original message decoded from the Base64 encoding. We then create a new string from the decoded byte array using the String class's constructor, passing in the byte array as an argument, and print it to the console.
  5. If the user enters any other value, we print an error message to the console.

# Prerequisites
  - Java(jdk)
# commands
1. To Compile the Program:
  - `javac MessageEncoderdecoder.java`
2. To Run the Program :
- `java MessageEncoderdecoder`

# :tada:


