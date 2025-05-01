.class Lcom/join/mgps/dialog/e$a;
.super Ljava/lang/Object;
.source "AppUpdateDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/e;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/e;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-object p1, p1, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-object p1, p1, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->O2(Landroid/content/Context;Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-boolean v0, p1, Lcom/join/mgps/dialog/e;->l:Z

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-object v1, v1, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    invoke-virtual {v1}, Lcom/join/mgps/dto/VersionDto;->getFilepath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-object v1, v1, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lcom/join/mgps/dialog/e;->b(Lcom/join/mgps/dialog/e;Ljava/io/File;Landroid/content/Context;)V

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p1, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/service/UpdateService_;->p(Landroid/content/Context;)Lcom/join/mgps/service/UpdateService_$a;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-object v0, v0, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    invoke-virtual {v0}, Lcom/join/mgps/dto/VersionDto;->getAndroidUrl()Ljava/lang/String;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {p1, v1, v0}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/service/UpdateService_$a;

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 6
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-boolean v0, p1, Lcom/join/mgps/dialog/e;->k:Z

    if-nez v0, :cond_2

    .line 7
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/join/mgps/dialog/e$a;->b:Lcom/join/mgps/dialog/e;

    iget-object p1, p1, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u66f4\u65b0\u5305\u5f00\u59cb\u4e0b\u8f7d"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string p1, "\u7f51\u7edc\u672a\u8fde\u63a5\uff0c\u8bf7\u68c0\u67e5\u91cd\u8bd5"

    .line 10
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method
