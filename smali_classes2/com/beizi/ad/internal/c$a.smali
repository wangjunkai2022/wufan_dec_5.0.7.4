.class Lcom/beizi/ad/internal/c$a;
.super Ljava/lang/Object;
.source "AdFetcher.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/c;


# direct methods
.method private constructor <init>(Lcom/beizi/ad/internal/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/c$a;->a:Lcom/beizi/ad/internal/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/ad/internal/c;Lcom/beizi/ad/internal/c$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/beizi/ad/internal/c$a;-><init>(Lcom/beizi/ad/internal/c;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->handler_message_pass:I

    .line 2
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/c$a;->a:Lcom/beizi/ad/internal/c;

    invoke-static {v0}, Lcom/beizi/ad/internal/c;->a(Lcom/beizi/ad/internal/c;)Lcom/beizi/ad/internal/c$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method
