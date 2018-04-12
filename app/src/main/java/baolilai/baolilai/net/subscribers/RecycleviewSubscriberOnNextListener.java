package baolilai.baolilai.net.subscribers;

public interface RecycleviewSubscriberOnNextListener<T> {
    void onNext(T t);

    void onErr(int drawable, String msg);
}
