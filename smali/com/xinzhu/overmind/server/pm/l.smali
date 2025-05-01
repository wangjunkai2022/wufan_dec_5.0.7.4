.class public final synthetic Lcom/xinzhu/overmind/server/pm/l;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/xinzhu/overmind/server/pm/n;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lcom/xinzhu/overmind/server/pm/n;Ljava/lang/Object;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/xinzhu/overmind/server/pm/l;->b:Lcom/xinzhu/overmind/server/pm/n;

    iput-object p2, p0, Lcom/xinzhu/overmind/server/pm/l;->c:Ljava/lang/Object;

    iput p3, p0, Lcom/xinzhu/overmind/server/pm/l;->d:I

    iput-boolean p4, p0, Lcom/xinzhu/overmind/server/pm/l;->e:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/xinzhu/overmind/server/pm/l;->b:Lcom/xinzhu/overmind/server/pm/n;

    iget-object v1, p0, Lcom/xinzhu/overmind/server/pm/l;->c:Ljava/lang/Object;

    iget v2, p0, Lcom/xinzhu/overmind/server/pm/l;->d:I

    iget-boolean v3, p0, Lcom/xinzhu/overmind/server/pm/l;->e:Z

    invoke-static {v0, v1, v2, v3}, Lcom/xinzhu/overmind/server/pm/m;->g(Lcom/xinzhu/overmind/server/pm/n;Ljava/lang/Object;IZ)V

    return-void
.end method
