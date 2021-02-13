package week14.d01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Transformers {
    public <T, R> List<R> map(List<T> list, Function<T, R> transformer) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            result.add(transformer.apply(item));
        }
        result = list.stream().map(item -> transformer.apply(item)).collect(Collectors.toList());
        result = list.stream().map(transformer::apply).collect(Collectors.toList());
        return result;
    }

    public <T> T reduce(List<T> list, T identity, BiFunction<T, T, T> combiner) {
        T result = identity;
        for (T item : list){
            result = combiner.apply(result, item);
        }
        result = list.stream().reduce(identity, (acc, next) -> combiner.apply(acc, next));
        result = list.stream().reduce(identity, combiner::apply);
        return result;
    }

}
