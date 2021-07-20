package mediator;

public interface ISource {
	void setMediator(Mediator mediator);
	void eventOccured(String event);
}
