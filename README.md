1. `FindTagContents.java`

Prompt the user for a chunk of HTML text, then for an HTML tag type (use `Scanner`). Print the contents of the first instance of that tag. If that tag doesn't appear, print an appropriate message

HTML | searched tag type | expected output
---|---|---
`<b>the</b> <span>quick</span> <b>brown</b>` | b | the
`<b>the</b> <span>quick</span> <b>brown</b>` | span | quick
`<b>the</b> <span>quick</span> <b>brown</b>` | p | there are no 'p' tags in the entered HTML

2. `FindWord.java`

Prompt the user for a sentence/phrase, then for a letter (use `Scanner`). Search for the letter within the sentence, and print the (first) whole word in which that letter occurs. If the letter doesn't appear in the sentence, print an appropriate message relating this information.

sentence | letter | expected output
---|---|---
the quick brown fox jumped | z | letter not in sentence
the quick brown fox jumped | o | brown
the quick brown fox jumped | d | jumped
the quick brown fox jumped | h | the


