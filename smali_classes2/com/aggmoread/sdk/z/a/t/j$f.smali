.class public interface abstract Lcom/aggmoread/sdk/z/a/t/j$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/t/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "f"
.end annotation


# static fields
.field public static final a:Lcom/aggmoread/sdk/z/a/t/j$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/a/t/j$f$a;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/t/j$f$a;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/a/t/j$f;->a:Lcom/aggmoread/sdk/z/a/t/j$f;

    return-void
.end method


# virtual methods
.method public abstract canSkip()Z
.end method

.method public abstract onClose()V
.end method

.method public abstract onShow()V
.end method
