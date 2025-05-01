.class Lcom/beizi/fusion/sm/a/a$a;
.super Ljava/lang/Object;
.source "DeviceID.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/sm/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lcom/beizi/fusion/sm/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/beizi/fusion/sm/a/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/beizi/fusion/sm/a/a;-><init>(Lcom/beizi/fusion/sm/a/a$1;)V

    sput-object v0, Lcom/beizi/fusion/sm/a/a$a;->a:Lcom/beizi/fusion/sm/a/a;

    return-void
.end method
