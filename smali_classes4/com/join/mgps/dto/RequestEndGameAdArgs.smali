.class public Lcom/join/mgps/dto/RequestEndGameAdArgs;
.super Ljava/lang/Object;
.source "RequestEndGameAdArgs.java"


# instance fields
.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/RequestEndGameAdArgs;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/RequestEndGameAdArgs;->uid:Ljava/lang/String;

    return-void
.end method
