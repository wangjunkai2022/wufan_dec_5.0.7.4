.class public Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;
.super Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;
.source "AppInstrumentationHook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;


# direct methods
.method public constructor <init>(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;-><init>()V

    return-void
.end method


# virtual methods
.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->b(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)V

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->c()Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "callActivityOnCreate: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    new-instance v0, Lcom/xinzhu/haunted/android/app/a;

    invoke-direct {v0, p1}, Lcom/xinzhu/haunted/android/app/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/xinzhu/haunted/android/app/a;->h()Landroid/content/pm/ActivityInfo;

    move-result-object v0

    .line 4
    invoke-static {p1}, Lcom/xinzhu/overmind/client/hook/fixer/ContextFixer;->fix(Landroid/content/Context;)V

    .line 5
    invoke-static {p1}, Lcom/xinzhu/overmind/client/hook/fixer/ActivityFixer;->fix(Landroid/app/Activity;)V

    .line 6
    iget v1, v0, Landroid/content/pm/ActivityInfo;->theme:I

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {p1, v1}, Landroid/app/Activity;->setTheme(I)V

    .line 8
    :cond_0
    iget v0, v0, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 9
    invoke-super {p0, p1, p2}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 10
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 11
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    if-ne v0, p1, :cond_1

    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Create:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    if-ne v0, v1, :cond_1

    return-void

    .line 12
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Create:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V

    .line 13
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getActivityLifecycleCallback()Lcom/xinzhu/overmind/client/hook/delegate/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/xinzhu/overmind/client/hook/delegate/a;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 1

    .line 14
    iget-object p3, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {p3}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->b(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)V

    .line 15
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->c()Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "callActivityOnCreate: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    new-instance p3, Lcom/xinzhu/haunted/android/app/a;

    invoke-direct {p3, p1}, Lcom/xinzhu/haunted/android/app/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p3}, Lcom/xinzhu/haunted/android/app/a;->h()Landroid/content/pm/ActivityInfo;

    move-result-object p3

    .line 17
    invoke-static {p1}, Lcom/xinzhu/overmind/client/hook/fixer/ContextFixer;->fix(Landroid/content/Context;)V

    .line 18
    invoke-static {p1}, Lcom/xinzhu/overmind/client/hook/fixer/ActivityFixer;->fix(Landroid/app/Activity;)V

    .line 19
    iget v0, p3, Landroid/content/pm/ActivityInfo;->theme:I

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setTheme(I)V

    .line 21
    :cond_0
    iget p3, p3, Landroid/content/pm/ActivityInfo;->screenOrientation:I

    invoke-virtual {p1, p3}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 22
    invoke-super {p0, p1, p2}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 23
    iget-object p3, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {p3}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/4 v0, 0x1

    if-le p3, v0, :cond_1

    .line 24
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object p3

    iget-object p3, p3, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    if-ne p3, p1, :cond_1

    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object p3

    iget-object p3, p3, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    sget-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Create:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    if-ne p3, v0, :cond_1

    return-void

    .line 25
    :cond_1
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object p3

    sget-object v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Create:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {p3, p1, v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V

    .line 26
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object p3

    invoke-virtual {p3}, Lcom/xinzhu/overmind/Overmind;->getActivityLifecycleCallback()Lcom/xinzhu/overmind/client/hook/delegate/a;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lcom/xinzhu/overmind/client/hook/delegate/a;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method

.method public callActivityOnDestroy(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callActivityOnDestroy(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Destroy:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    if-ne v0, v1, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Destroy:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getActivityLifecycleCallback()Lcom/xinzhu/overmind/client/hook/delegate/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/a;->onActivityDestroyed(Landroid/app/Activity;)V

    return-void
.end method

.method public callActivityOnPause(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callActivityOnPause(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Pause:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    if-ne v0, v1, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Pause:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getActivityLifecycleCallback()Lcom/xinzhu/overmind/client/hook/delegate/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/a;->onActivityPaused(Landroid/app/Activity;)V

    return-void
.end method

.method public callActivityOnResume(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callActivityOnResume(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Resume:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    if-ne v0, v1, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Resume:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getActivityLifecycleCallback()Lcom/xinzhu/overmind/client/hook/delegate/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/a;->onActivityResumed(Landroid/app/Activity;)V

    return-void
.end method

.method public callActivityOnStart(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callActivityOnStart(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Start:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    if-ne v0, v1, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Start:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getActivityLifecycleCallback()Lcom/xinzhu/overmind/client/hook/delegate/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/a;->onActivityStarted(Landroid/app/Activity;)V

    return-void
.end method

.method public callActivityOnStop(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callActivityOnStop(Landroid/app/Activity;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->d(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    iget-object v0, v0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->b:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Stop:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    if-ne v0, v1, :cond_0

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->e()Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;

    move-result-object v0

    sget-object v1, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;->Stop:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;

    invoke-virtual {v0, p1, v1}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord;->a(Landroid/app/Activity;Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$ActivityCallbackRecord$ActionType;)V

    .line 5
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->get()Lcom/xinzhu/overmind/Overmind;

    move-result-object v0

    invoke-virtual {v0}, Lcom/xinzhu/overmind/Overmind;->getActivityLifecycleCallback()Lcom/xinzhu/overmind/client/hook/delegate/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/a;->onActivityStopped(Landroid/app/Activity;)V

    return-void
.end method

.method public callApplicationOnCreate(Landroid/app/Application;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook$b;->a:Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;

    invoke-static {v0}, Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;->b(Lcom/xinzhu/overmind/client/hook/delegate/AppInstrumentationHook;)V

    .line 2
    invoke-super {p0, p1}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->callApplicationOnCreate(Landroid/app/Application;)V

    return-void
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;I)Landroid/app/Instrumentation$ActivityResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 4
    invoke-super/range {p0 .. p6}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;I)Landroid/app/Instrumentation$ActivityResult;

    move-result-object p1

    return-object p1
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-super/range {p0 .. p7}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;

    move-result-object p1

    return-object p1
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;Landroid/os/UserHandle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 6
    invoke-super/range {p0 .. p8}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;Landroid/os/UserHandle;)Landroid/app/Instrumentation$ActivityResult;

    move-result-object p1

    return-object p1
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Fragment;Landroid/content/Intent;I)Landroid/app/Instrumentation$ActivityResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 3
    invoke-super/range {p0 .. p6}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Fragment;Landroid/content/Intent;I)Landroid/app/Instrumentation$ActivityResult;

    move-result-object p1

    return-object p1
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 5
    invoke-super/range {p0 .. p7}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;

    move-result-object p1

    return-object p1
.end method

.method public execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 2
    invoke-super/range {p0 .. p7}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->execStartActivity(Landroid/content/Context;Landroid/os/IBinder;Landroid/os/IBinder;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/Instrumentation$ActivityResult;

    move-result-object p1

    return-object p1
.end method

.method public newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 2
    :catch_0
    iget-object v0, p0, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->root:Landroid/app/Instrumentation;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object p1

    return-object p1
.end method

.method public newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lcom/xinzhu/overmind/client/hook/fixer/ContextFixer;->fix(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getClient()Lcom/xinzhu/overmind/client/e;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/xinzhu/overmind/client/e;->loadXposed(Landroid/content/Context;)V

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/xinzhu/overmind/client/hook/delegate/InstrumentationDelegate;->newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;

    move-result-object p1

    return-object p1
.end method
