.class public Lcom/join/mgps/event/o;
.super Ljava/lang/Object;
.source "FinishActivityEvent.java"


# instance fields
.field private a:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/event/o;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/event/o;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public b(Ljava/lang/Class;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/event/o;->a:Ljava/lang/Class;

    return-void
.end method
