# Dictionary

The Dictionary class represents a simple dictionary application that allows users to add, search, and remove words from the dictionary. It also provides functionality to display initials and words stored in the dictionary.

## Table of contents
- Constructor
- Public Methods
    - addWord()
    - searchWord()
    - removeWord()
    - showInitials()
    - showWordsByInitials()
- Private Methods
    - getValidatedInput()
    - getInitial()

## Constructor

### public Dictionary()

Creates a new instance of the Dictionary class with an empty dictionary.

## Public Methods

### public void addWord()

Adds a word to the dictionary.

### public void searchWord()

Searches for a word in the dictionary.

### public void removeWord()

Removes a word from the dictionary.

### public void showInitials()

Displays the initials with words stored in the dictionary.

### public void showWordsByInitials()

Displays the words stored in the dictionary for a specific initial.

## Private Methods

### private String getValidatedInput()

Validates and returns user input by removing whitespace, numbers, and punctuation.

### private String getInitial(String word)

Extracts and returns the initial character of a word as an uppercase string.