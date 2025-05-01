.class Lcom/xinzhu/overmind/client/e$c;
.super Ljava/lang/Object;
.source "Overlord.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xinzhu/overmind/client/e;->bindApplication(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/os/ConditionVariable;

.field final synthetic e:Lcom/xinzhu/overmind/client/e;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/client/e;Ljava/lang/String;Ljava/lang/String;Landroid/os/ConditionVariable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/client/e$c;->e:Lcom/xinzhu/overmind/client/e;

    iput-object p2, p0, Lcom/xinzhu/overmind/client/e$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/xinzhu/overmind/client/e$c;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/xinzhu/overmind/client/e$c;->d:Landroid/os/ConditionVariable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/client/e$c;->e:Lcom/xinzhu/overmind/client/e;

    iget-object v1, p0, Lcom/xinzhu/overmind/client/e$c;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/xinzhu/overmind/client/e$c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/xinzhu/overmind/client/e;->handleBindApplication(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/xinzhu/overmind/client/e$c;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method
