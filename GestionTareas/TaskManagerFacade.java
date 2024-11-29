package GestionTareas;

public class TaskManagerFacade {
    private TaskManager taskManager;
    private NotificationManager notificationManager;
    public TaskManagerFacade() {
        this.taskManager = new TaskManager();
        this.notificationManager = new NotificationManager();
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }

    public void setTaskManager(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public void setNotificationManager(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    public void crearTarea(){
        //logica
    }
    public void eliminarTarea(){
        //logica
    }
    public void actualizarTarea(){
        //logica
    }
    public void cambiarEstrategiaVista(){
        //logica
    }
    public void notificar(){
        //logica
    }
}
