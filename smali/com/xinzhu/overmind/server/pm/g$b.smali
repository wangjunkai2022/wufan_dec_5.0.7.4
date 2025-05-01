.class Lcom/xinzhu/overmind/server/pm/g$b;
.super Ljava/lang/Object;
.source "IntentResolver.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/server/pm/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TF;>;"
    }
.end annotation


# instance fields
.field private final b:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TF;>;"
        }
    .end annotation
.end field

.field private c:Lcom/xinzhu/overmind/server/pm/MindPackage$IntentInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TF;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/xinzhu/overmind/server/pm/g;


# direct methods
.method constructor <init>(Lcom/xinzhu/overmind/server/pm/g;Ljava/util/Iterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "TF;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/g$b;->d:Lcom/xinzhu/overmind/server/pm/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/xinzhu/overmind/server/pm/g$b;->b:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public a()Lcom/xinzhu/overmind/server/pm/MindPackage$IntentInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TF;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/g$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/xinzhu/overmind/server/pm/MindPackage$IntentInfo;

    iput-object v0, p0, Lcom/xinzhu/overmind/server/pm/g$b;->c:Lcom/xinzhu/overmind/server/pm/MindPackage$IntentInfo;

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/g$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xinzhu/overmind/server/pm/g$b;->a()Lcom/xinzhu/overmind/server/pm/MindPackage$IntentInfo;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/g$b;->c:Lcom/xinzhu/overmind/server/pm/MindPackage$IntentInfo;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/g$b;->d:Lcom/xinzhu/overmind/server/pm/g;

    invoke-virtual {v1, v0}, Lcom/xinzhu/overmind/server/pm/g;->y(Lcom/xinzhu/overmind/server/pm/MindPackage$IntentInfo;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/g$b;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
