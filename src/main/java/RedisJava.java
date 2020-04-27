import redis.clients.jedis.Jedis;

public class RedisJava {

    Jedis jedis;
    DeepThought super_computer;
    public RedisJava(){
        Jedis jedis = new Jedis("localhost", 6379);
        DeepThought super_computer = new DeepThought();
        cache_answer();
    }

    private void cache_answer(){
        int ans = this.super_computer.answer_to_the_ultimate_question_of_life_the_universe_and_everything();
        this.jedis.set("answer_to_the_ultimate_question_of_life_the_universe_and_everything", String.valueOf(ans));
    }

    public String get_cached_value(){
        return this.jedis.get("answer_to_the_ultimate_question_of_life_the_universe_and_everything");
    }
}