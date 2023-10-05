package lotr;

import java.util.List;
import java.util.Random;
import java.lang.reflect.InvocationTargetException;

abstract class CharacterFactory {
    public Character createCharacter()
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        
        List<Class<? extends Character>> characterClasses = List.of(Elf.class, Hobbit.class, Knight.class, King.class);
        int randomIndex = new Random().nextInt(characterClasses.size());  // generate a random index
        Class<? extends Character> selectedCharacterClass = characterClasses.get(randomIndex);
        
        // create an object of the selected class using reflection
        Character character = selectedCharacterClass.getConstructor().newInstance();
        
        return character;
    }
}
