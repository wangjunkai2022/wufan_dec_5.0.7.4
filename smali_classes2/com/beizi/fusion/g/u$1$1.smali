.class Lcom/beizi/fusion/g/u$1$1;
.super Ljava/lang/Object;
.source "DownloadApkConfirmDialog.java"

# interfaces
.implements Landroid/text/util/Linkify$TransformFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/g/u$1;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/g/u$1;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/g/u$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/g/u$1$1;->a:Lcom/beizi/fusion/g/u$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final transformUrl(Ljava/util/regex/Matcher;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
