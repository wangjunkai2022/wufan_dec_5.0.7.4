.class public final synthetic Lcom/join/mgps/dialog/o1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/dialog/p1;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/dialog/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/dialog/o1;->b:Lcom/join/mgps/dialog/p1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/dialog/o1;->b:Lcom/join/mgps/dialog/p1;

    invoke-static {v0}, Lcom/join/mgps/dialog/p1;->b(Lcom/join/mgps/dialog/p1;)V

    return-void
.end method
