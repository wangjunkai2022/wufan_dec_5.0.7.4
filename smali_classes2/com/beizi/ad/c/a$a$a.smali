.class public final Lcom/beizi/ad/c/a$a$a;
.super Ljava/lang/Object;
.source "AdRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$a$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public a()Lcom/beizi/ad/c/a$a;
    .locals 3

    .line 2
    new-instance v0, Lcom/beizi/ad/c/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/beizi/ad/c/a$a;-><init>(Lcom/beizi/ad/c/a$1;)V

    .line 3
    iget-wide v1, p0, Lcom/beizi/ad/c/a$a$a;->d:J

    invoke-static {v0, v1, v2}, Lcom/beizi/ad/c/a$a;->a(Lcom/beizi/ad/c/a$a;J)J

    .line 4
    iget-object v1, p0, Lcom/beizi/ad/c/a$a$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$a;->a(Lcom/beizi/ad/c/a$a;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    iget-object v1, p0, Lcom/beizi/ad/c/a$a$a;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$a;->b(Lcom/beizi/ad/c/a$a;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    iget-object v1, p0, Lcom/beizi/ad/c/a$a$a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$a;->c(Lcom/beizi/ad/c/a$a;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/c/a$a$a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/beizi/ad/c/a$a;->d(Lcom/beizi/ad/c/a$a;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$a$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/beizi/ad/c/a$a$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$a$a;->c:Ljava/lang/String;

    return-object p0
.end method
