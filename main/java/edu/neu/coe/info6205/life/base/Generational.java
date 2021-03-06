package life.base;

import java.util.function.BiConsumer;

interface Generational<Parent, Child> {

		Parent generation(BiConsumer<Long, Child> monitor);
}
