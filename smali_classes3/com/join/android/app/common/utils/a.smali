.class public final synthetic Lcom/join/android/app/common/utils/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/android/app/common/utils/APKUtils;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Lcom/join/android/app/common/utils/APKUtils;Landroid/content/Context;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/android/app/common/utils/a;->b:Lcom/join/android/app/common/utils/APKUtils;

    iput-object p2, p0, Lcom/join/android/app/common/utils/a;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/join/android/app/common/utils/a;->d:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/join/android/app/common/utils/a;->b:Lcom/join/android/app/common/utils/APKUtils;

    iget-object v1, p0, Lcom/join/android/app/common/utils/a;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/android/app/common/utils/a;->d:Ljava/io/File;

    invoke-static {v0, v1, v2}, Lcom/join/android/app/common/utils/APKUtils;->a(Lcom/join/android/app/common/utils/APKUtils;Landroid/content/Context;Ljava/io/File;)V

    return-void
.end method
